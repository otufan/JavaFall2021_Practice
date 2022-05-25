package sort_suchAlgoritmusVergleichen;

public class Sortieralgorithmen {

	public void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 1; j < (arr.length - i); j++) {

				if (arr[j - 1] > arr[j]) {

					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}
	}

	public void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			int key = arr[i];
			int a = i - 1;

			while ((a > -1) && (arr[a] > key)) {

				arr[a + 1] = arr[a];

				a--;
			}
			arr[a + 1] = key;
		}
	}

	public void shellSort(int[] arr) {

		int n = arr.length;

		for (int gap = n / 2; gap > 0; gap /= 2) {

			for (int i = gap; i < n; i++) {

				int key = arr[i];
				int j = i;

				while (j >= gap && arr[j - gap] > key) {
					arr[j] = arr[j - gap];
					j -= gap;
				}
				arr[j] = key;
			}
		}
	}

	public int partition(int[] arr, int start, int end) {

		int pivot = arr[end];
		int i = (start - 1);

		for (int j = start; j < end; j++) {

			if (arr[j] <= pivot) {
				i++;
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
			}
		}

		int t = arr[i + 1];
		arr[i + 1] = arr[end];
		arr[end] = t;
		return (i + 1);
	}

	public void quick(int[] arr, int start, int end) {

		if (start < end) {
			int p = partition(arr, start, end);
			quick(arr, start, p - 1);
			quick(arr, p + 1, end);
		}

	}

}
