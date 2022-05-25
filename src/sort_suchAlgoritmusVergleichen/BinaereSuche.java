package sort_suchAlgoritmusVergleichen;

public class BinaereSuche extends Thread {//Es werden Multithread-Funktionen verwendet, die von der Thread-Klasse erben, 
	  									  //da die Verarbeitungszeit parallel gemessen werden muss

	private int[] arr;
	private int key;
	private int fromIndex;
	private int toIndex;
	private long nanos;

	public BinaereSuche(int[] arr, int fromIndex, int toIndex, int key) 
	{
		this.arr = arr;
		this.key = key;
		this.fromIndex = fromIndex;
		this.toIndex = toIndex;
	}

	public long getNanos() 
	{
		return nanos;
	}

	public int binaereSuche() 
	{
		int l = fromIndex; 
		int r = toIndex - 1;
		
		 while (l <= r) 
		 {			 
	            int m = l + (r - l) / 2;
	 
	            if (arr[m] == key) 
	            {
	            	return m;
	            }	                
	 
	            if (arr[m] < key) 
	            {
	            	l = m + 1;
	            }             
	 
	            else 
	            {
	            	r = m - 1;
	            }
	                
	        } 
	      
	        return -1;
	}

	@Override
	public void run() //mithilfe der Methode run erfolgenZeitmessung und Elementsuche gleichzeitig
	{
		long startTime = System.nanoTime();	//Da der Algorithmus sehr schnell ist, wird er in Nanosekunden gemessen 
		binaereSuche();						//und dann auch in Float als Millisekunden ausgegeben.
		nanos=System.nanoTime() - startTime;	
		
	}

}
