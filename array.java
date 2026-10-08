public class Task4ArrayResize { 
 
    public static int[] increaseSize(int[] oldArray, int newSize) { 
 
        int[] newArray = new int[newSize]; 
 
        for (int i = 0; i < oldArray.length; i++) {             newArray[i] = oldArray[i]; 
        } 
 
        return newArray; 
    }  
    public static void main(String[] args) { 
 
        int[] numbers = new int[10]; 
 
        for (int i = 0; i < numbers.length; i++) {             numbers[i] = i + 1; 
        } 
 
        System.out.println("Original Array Size: " + numbers.length);  
        System.out.println("Original Array:"); 
 
        for (int number : numbers) {             System.out.print(number + " "); 
        }        
        numbers = increaseSize(numbers, 15); 
 
        System.out.println("\n\nNew Array Size: " + numbers.length); 
 
        for (int i = 10; i < numbers.length; i++) {             numbers[i] = i + 1; 
        } 
 
        System.out.println("New Array:"); 
 
        for (int number : numbers) {             System.out.print(number + " "); 
        } 
    } 
} 
