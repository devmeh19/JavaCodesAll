// Java program to find maximum cash 
// flow among a set of persons

class MinimiseCashFlows
{
	// Number of persons (or vertices in the graph)
	static final int N = 3;
	
	// A utility function that returns 
	// index of minimum value in arr[]
	static int getMin(int arr[])
	{
		int minInd = 0;
		for (int i = 1; i < N; i++)
			if (arr[i] < arr[minInd])
				minInd = i;
		return minInd;
	}
	
	// A utility function that returns 
	// index of maximum value in arr[]
	static int getMax(int arr[])
	{
		int maxInd = 0;
		for (int i = 1; i < N; i++)
			if (arr[i] > arr[maxInd])
				maxInd = i;
		return maxInd;
	}
	
	// A utility function to return minimum of 2 values
	static int minOf2(int x, int y)
	{
		return (x < y) ? x: y;
	}
	
	// amount[p] indicates the net amount 
	// to be credited/debited to/from person 'p'
	// If amount[p] is positive, then 
	// i'th person will amount[i]
	// If amount[p] is negative, then 
	// i'th person will give -amount[i]
	static void minCashFlowRec(int amount[])
	{
		// Find the indexes of minimum and
		// maximum values in amount[]
		// amount[mxCredit] indicates the maximum amount 
		// to be given (or credited) to any person .
		// And amount[mxDebit] indicates the maximum amount 
		// to be taken(or debited) from any person.
		// So if there is a positive value in amount[], 
		// then there must be a negative value
		int mxCredit = getMax(amount), mxDebit = getMin(amount);
	
		// If both amounts are 0, then 
		// all amounts are settled
		if (amount[mxCredit] == 0 && amount[mxDebit] == 0)
			return;
	
		// Find the minimum of two amounts
		int min = minOf2(-amount[mxDebit], amount[mxCredit]);
		amount[mxCredit] -= min;
		amount[mxDebit] += min;
	
		// If minimum is the maximum amount to be
		System.out.println("Person " + mxDebit + " pays " + min
								+ " to " + "Person " + mxCredit);
	
		// Recur for the amount array. 
		// Note that it is guaranteed that
		// the recursion would terminate 
		// as either amount[mxCredit] or 
		// amount[mxDebit] becomes 0
		minCashFlowRec(amount);
	}
	
	// Given a set of persons as graph[] 
	// where graph[i][j] indicates
	// the amount that person i needs to 
	// pay person j, this function
	// finds and prints the minimum 
	// cash flow to settle all debts.
	static void minCashFlow(int graph[][])
	{
		// Create an array amount[], 
		// initialize all value in it as 0.
		int amount[]=new int[N];
	
		// Calculate the net amount to 
		// be paid to person 'p', and
		// stores it in amount[p]. The 
		// value of amount[p] can be
		// calculated by subtracting 
		// debts of 'p' from credits of 'p'
		for (int p = 0; p < N; p++)
		for (int i = 0; i < N; i++)
			amount[p] += (graph[i][p] - graph[p][i]);
	
		minCashFlowRec(amount);
	}
	
	// Driver code
	public static void main (String[] args)
	{
		// graph[i][j] indicates the amount 
		// that person i needs to pay person j
		int graph[][] = { {0, 1000, 2000},
							{0, 0, 5000},
							{0, 0, 0},};
	
		// Print the solution
		minCashFlow(graph);
	}
}

// This code is contributed by Anant Agarwal.
