package corejava.streams.test;

import static java.util.stream.Collectors.*; 
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class TestClass {

	public static void main(String[] args) {
	
		List<Fruit> fruits=TestData.getAllFruits();
		List<Fruit> lowCalorieFruit= fruits.stream().filter((Fruit f)-> f.calories<100?true:false).sorted(Comparator.comparing(Fruit::getCalories).reversed()).collect(Collectors.toList()); 
		//lowCalorieFruit.forEach(System.out::println);
		
		
		Map<String, List<Fruit>> fruitByColour = fruits.stream().collect(groupingBy(Fruit::getColor));
/*		fruitByColour.forEach((k,v)->{
			System.out.println(k + " Fruits : "); 
			v.forEach((f)->System.out.println("\t"+f.getName()));
		});*/
		
		
		List<Fruit> redFruit= fruits.stream().filter((Fruit f)-> f.getColor().equals("Red")?true:false).sorted(Comparator.comparing(Fruit::getPrice)).collect(Collectors.toList()); 
		//redFruit.forEach(System.out::println);
		
		List<News> news=TestData.getAllNews();
		Map<Integer, Long> res=news.stream().collect(groupingBy(News::getNewsId, counting()));
		Integer max=news.stream().collect(groupingBy(News::getNewsId, counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
		//System.out.println(max);

		//System.out.println("budget occurence: "+news.stream().filter((News n)->n.getComment().contains("budget")).count());
		
		//news.stream().collect(groupingBy(News::getCommentByUser, counting())).entrySet().forEach(System.out::println);
		
		List<Transaction> traderList=TestData.getAllTransactions();
		//traderList.stream().filter((Transaction t)->t.getYear()==2011?true:false).sorted(Comparator.comparing(Transaction::getValue)).forEach(System.out::println);
		
		//traderList.stream().map((Transaction t)->t.getTrader().getCity()).distinct().forEach(System.out::println);
		
		String s= traderList.stream().map((Transaction t)->t.getTrader().getName()).sorted().collect(Collectors.toList()).toString();
		//System.out.println(s);
		
		//traderList.stream().filter((Transaction t)->t.getTrader().getCity().equals("Pune")?true:false).sorted(Comparator.comparing((Transaction t)->t.getTrader().getName())).forEach(System.out::println);
		
		//System.out.println(traderList.stream().map((Transaction t)->t.getTrader().getCity()).anyMatch((t)-> t.equals("Indore")));
		
		//traderList.stream().filter((Transaction t)->t.getTrader().getCity().equals("Delhi")).map(Transaction::getValue).forEach(System.out::println);
		Optional<Transaction> maxValue =traderList.stream().collect(maxBy(Comparator.comparing(Transaction::getValue)));
		//System.out.println(maxValue.toString());
		
		Optional<Transaction> minValue =traderList.stream().collect(minBy(Comparator.comparing(Transaction::getValue)));
		//System.out.println(minValue.toString());
		
		System.out.println(news.stream().collect(groupingBy(News::getCommentByUser, counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey());
	}

}