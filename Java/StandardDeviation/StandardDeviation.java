public class StandardDeviation{ 
    public static int add(int [] numbers){
    
    int total = 0;
    
    for(int number : numbers){
    total += number;
    }
    return total;
    }
    
   public static double mean(int [] numbers){
   
   int length = numbers.length;
   int sum = add(numbers);
   
   double result = (double) sum / length;
   
   return result;
   }
   
   public static double meanDeviation(int [] numbers){
   double total = 0;
   
   for(int number : numbers){
   double deviation = number- mean(numbers);
       
   total += deviation;
   }
   return total;
   }
   
  public static double variance(int [] numbers){
  
  double mean = mean(numbers);
  double sum = 0.0;
  
  for(int number : numbers){
  double deviation = number - mean;
  
  sum += deviation * deviation;
  }
  return sum;
  
  }
  
  public static double squaredVariance(int [] numbers){
  double variance = variance(numbers);
  double result = Math.sqrt(variance);
  
  return result;
  }
}
