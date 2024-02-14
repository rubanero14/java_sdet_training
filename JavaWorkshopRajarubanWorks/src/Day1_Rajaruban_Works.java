import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class Day1_Rajaruban_Works {
	int x, y;
	
	public static int sumOfTwoNumbers(int x, int y) {
		return x + y;
	}
	
	public static void swapTwoNumbers(int x, int y) {
		int z = y;
		y = x;
		x = z;
		System.out.println("Value of X: " + x + " and value of Y: " + y);
	}
	
	public static String printGrades(int percentage) {
		String grade;
		
		if(percentage > 80) {
			grade = "Distiction";
		} else if(percentage >= 60 && percentage <= 80) {
			grade = "Good";
		} else if(percentage >= 40 && percentage < 60) {
			grade = "Pass";
		} else {
			grade = "Fail";
		}
		
		return grade;
	}
	
	public static String showDayName(int number1) {
		String day;
		switch(number1) {
			case 1:
				day = "Sunday";
				break;
			case 2:
				day = "Monday";
				break;
			case 3:
				day = "Tueday";
				break;
			case 4:
				day = "Wednesday";
				break;
			case 5:
				day = "Thursday";
				break;
			case 6:
				day = "Friday";
				break;
			case 7:
				day = "Saturday";
				break;
			default:
				day = "Please enter correct value";
				
		}
		return day;
	}
	
	public static void printTableOfNine() {
		boolean keepCounting = true;
		while(keepCounting) {
			for(int i = 1; i <= 9; i++) {
				System.out.println(i);
				if(i == 9) {
					keepCounting = false;
				}
			}
		};
	}
	
	public static void launchBrowserUsingSelenium(String url) {
		// Launch Chrome browser using Selenium
				System.setProperty(
			            "webdriver.chrome.driver",
			            "C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
			        // Instantiate a ChromeDriver class.
			        WebDriver driver = new ChromeDriver();
			 
			        // Maximize the browser
			        driver.manage().window().maximize();
			 
			        // Launch Website
			        driver.get(url);
	}
	
	public static String checkIsEvenOrOdd(int val) {
		return val + " is " + (val % 2 == 0 ?  "Even" : "Odd") + " number.";
	}
	
	public static String findMinAndMax(double[] numArray) {
		double minValue = numArray[0];
		double maxValue = numArray[0];
		
		for (double num : numArray) {
			if(num > maxValue) {
				maxValue = num;
			}
			
			if(num < minValue) {
				minValue = num;
			}
		}
		
		return "Max value is: " + maxValue + ", \nMin value is: " + minValue;
	}
	
	public static String checkIsPalindrome(String str) {
		String regex = "[^a-zA-Z]";
		String formattedStr = str.replaceAll(regex, "").toLowerCase();
		String[] strArr = formattedStr.split("");
		String[] reversedArr = new String[strArr.length];

		for (int i = 0; i < strArr.length; i++) {
            reversedArr[i] = strArr[strArr.length - 1 - i];
        }
		
		formattedStr = String.join("", strArr);
		String reversedStr = String.join("", reversedArr);

		return str + (formattedStr.contentEquals(reversedStr) ? " is " : " not ") + "Palindrome string";
	}
	
	
	public static long factorialCalculator(long val) {
		if(val <= 0 || val > 20) {
			return 1;
		}

		return val * factorialCalculator(val - 1);
	}
	
	public static void main(String[] args) {
//		Day1_Rajaruban_Works d1 = new Day1_Rajaruban_Works();
//		
//		d1.x = 2;
//		d1.y = 3;
//		
//		int x = d1.x;
//		int y = d1.y;
//		
//		System.out.println("Sum of two numbers: " + sumOfTwoNumbers(x, y));
		
//		swapTwoNumbers(x, y);
		
//		System.out.println(printGrades(81));
		
//		printTableOfNine();
		
//		launchBrowserUsingSelenium("https://www.google.com/");
		
//		System.out.println(checkIsEvenOrOdd(99));
		
//		double[] numArray = {5, 6, 4, 30, 1, 2, 0.5};
//		System.out.println(findMinAndMax(numArray));	
		
		System.out.println(checkIsPalindrome("kayak"));
		
		long factorial = 20;
		long result = factorialCalculator(factorial);
		System.out.println("Factorial for " + factorial + " is " + result);	
	}
	
}
