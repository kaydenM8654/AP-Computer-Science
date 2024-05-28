package Q4.Prog7301m;

public class MultiLayerPerceptron {
    private double fLearningRate;
    private Layer[] flayers;
    private Activations.Activation fActivation;

    public MultiLayerPerceptron(int[] layers, double learningRate, Activations.Activation activation) {
        fLearningRate = learningRate;
        fActivation = activation;
        flayers = new Layer[layers.length];
        for(int i = 0; i < layers.length; i++)
            flayers[i] = (i == 0) ? new Layer(layers[i], 0)
                                  : new Layer(layers[i], layers[i + 1]);
    }

    public double[] feedFoward(double[] x){
        double result;
        double[] output = new double[flayers[flayers.length-1].Size];

        for(int i = 0; i < flayers[0].Size; i++) flayers[0].Neurons[i].Value = x[i];
        for(int k = 1; k < flayers.length; k++){
            for(int i = 0; i < flayers[k].Size; i++){
                result = 0.0;
                for(int j = 0; j < flayers[k-1].Size; j++)
                    result += flayers[k].Neurons[i].Weights[j] * flayers[k-1].Neurons[j].Value;
                result += flayers[k].Neurons[i].Bias;
                flayers[k].Neurons[i].Value = fActivation.activate(result);
            }
        }
        for(int i = 0; i < flayers[flayers.length].Size; i++)
            output[i] = flayers[flayers.length-1].Neurons[i].Value;
        return output;
    }

    public double backPropagate(double[] X, double[] output){
        double[] result = feedFoward(X);
        double error = 0.0;
        int outputSize = flayers[flayers.length-1].Size;
        for(int i = 0; i < outputSize; i++){
            error = output[i] - result[i];
            flayers[flayers.length-1].Neurons[i].Delta = error * fActivation.activateDeriv(result[i]);
        }

        for(int k = flayers.length-2; k >= 0; k--){
            for(int i = 0; i < flayers[k].Size; i++){
                error = 0;
                for(int j = 0; j < flayers[k+1].Size; j++)
                    error += flayers[k+1].Neurons[j].Delta * flayers[k+1].Neurons[j].Weights[i];
                flayers[k].Neurons[i].Delta = error * fActivation.activateDeriv(flayers[k].Neurons[i].Value);
            }
            for(int i = 0; i < flayers[k+1].Size; i++){
                for(int j = 0; j < flayers[k].Size; j++)
                    flayers[k+1].Neurons[i].Weights[j] += fLearningRate *
                            flayers[k+1].Neurons[i].Delta * flayers[k].Neurons[j].Value;
                flayers[k+1].Neurons[i].Bias += fLearningRate *
                        flayers[k+1].Neurons[i].Delta;
            }
        }

        error = 0.0;
        for(int i = 0; i < output.length; i++) error += Math.abs(result[i]-output[i]);
        return error/output.length;
    }
    public double[] predict(double[] X) { return feedFoward(X); }

    public double accuracy(double[][] X, double[][] output) {
        double error = 0;
        for(int i = 0; i < X.length; i++){
            double[] result = feedFoward(X[i]);
            for(int j = 0; j < output[i].length; j++)
                error += Math.abs(result[j] - output[i][j]);
        }
        return 1 - error / (X.length * output[0].length);
    }

    public void train(double[] [] X_train, double[][] y_train, int epochs){
        for(int epoch = 0; epoch < epochs; epoch++){
            double loss = 0;
            for(int i = 0; i < X_train.length; i++)
                loss += backPropagate(X_train[i], y_train[i]);
            loss /= X_train.length;
            System.out.printf("Epoch %d:\tloss: %.6f\t\tAccuracy");
        }
    }
}
