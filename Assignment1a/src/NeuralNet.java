import java.io.File;
import java.io.IOException;
import java.lang.Math;

/**
 * NeuralNet class for Assignment 1a of EECE592. A simple neural network with one hidden layer,
 * a selectable number of hidden neurons (up to MAX_HIDDEN_NEURONS) and a selectable number of
 * inputs (up to MAX_INPUTS)
 */
public class NeuralNet implements NeuralNetInterface
{
    // Constants
    static final int MAX_HIDDEN_NEURONS =  256;
    static final int MAX_INPUTS =          4+1;
    static final int BIAS_INDEX =          0;
    static final double WEIGHT_INIT_MIN =  -0.5;
    static final double WEIGHT_INIT_MAX =  0.5;

    // Private member variables
    // Limits for custom sigmoid activation function used by the output neuron
    private double mArgA;
    private double mArgB;

    // Public member variables
    // Neural network parameters
    // We only have a single hidden layer with a provided number of inputs and hidden neurons
    public int mNumInputs;
    public int mNumHiddenNeurons;
    // Array to store input values to the neural network, first index is bias input of 1
    public double[] mInputValues = new double[MAX_INPUTS];
    // Array to store neuron weights of hidden layer
    public static double[] mNeuronWeights = new double[MAX_HIDDEN_NEURONS];
    // Variable for the value of the output neuron's weight
    public static double mOutputNeuronWeight;
    // Variable for value of output neuron
    public double mOutputValue;

    /**
     * Constructor for NeuralNet
     * @param argNumInputs The number of inputs in your input vector
     * @param argNumHidden The number of hidden neurons in your hidden layer. Only a single hidden layer is supported
     * @param argLearningRate The learning rate coefficient
     * @param argMomentumTerm The momentum coefficient
     * @param argA Integer lower bound of sigmoid used by the output neuron only.
     * @param argB Integer upper bound of sigmoid used by the output neuron only.
    */
    public NeuralNet(int argNumInputs,
                              int argNumHidden,
                              double argLearningRate,
                              double argMomentumTerm,
                              double argA,
                              double argB)
    {
        // Update our private variables
        mArgA = argA;
        mArgB = argB;
        mNumInputs = argNumInputs;
        mNumHiddenNeurons = argNumHidden;

        // Update the bias value to one
        mInputValues[BIAS_INDEX] = 1.0;

        // Initialize the weights to a random value between WEIGHT_INIT_MIN and WEIGHT_INIT_MAX
    }

    /**
     * This methods implements the sigmoid function
     * @param x The input
     * @return f(x) 1 / (1 + exp(-x))
     */
    public double sigmoid(double x)
    {
        return 1 / (1 + Math.pow(Math.E,-x));
    }

    /**
     * This method implements a general sigmoid with asymptotes bounded by (a,b)
     * @param x The input
     * @return f(x) = (b - a) / (1 + exp(-x)) - a
     */
    public double customSigmoid(double x)
    {
        return (mArgB - mArgA) * sigmoid(x) + mArgA;
    }

    /**
     * Initialize the weights to a random value between
     */
    public void initializeWeights()
    {

    }

    public void zeroWeights()
    {

    }

    /**
     * @param x The input vector. An array of doubles.
     * @return The value returned by the NN for this input vector
     */
    public double outputFor(double[] x)
    {
        return 1.0;
    }

    public double train(double[] x, double argValue)
    {
        return 1.0;
    }

    public void save(File argFile)
    {

    }

    public void load(String argFileName) throws IOException
    {

    }
}
