package __RoughPractice__.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingByStreamAPI {

    public static void main(String[] args) {


        //  Que : Given a list of students, find the student with the highest GPA in each department.
        Student s1 = new Student("aaa",45,"dept1");
        Student s2 = new Student("bbb",78,"dept3");
        Student s3 = new Student("ccc",46,"dept2");
        Student s4 = new Student("ddd",87,"dept3");
        Student s5 = new Student("eee",35,"dept1");
        Student s6 = new Student("eee",87,"dept1");

        ArrayList<Student> sList = new ArrayList<Student>();
        Collections.addAll(sList,s1,s2,s3,s4,s5,s6);

        //max marks per dept
        Map<String, List<Student>> sMap = sList.stream().collect(Collectors.groupingBy(Student::getDept));
        sMap.entrySet().stream().forEach( a -> System.out.println(a.getKey()+" : max is : "+
        a.getValue().stream().map( b -> b.getMarks() ).collect(Collectors.toList()).stream().sorted( (c,d) -> c<d?1:-1).findFirst().get()
        ));

        //min marks per dept
        sList.stream().collect(Collectors.groupingBy(Student::getDept,Collectors.minBy( (a,b)-> a.getMarks()>b.getMarks()?1:-1 )))
                .entrySet().stream().forEach( c->System.out.println(c.getKey()+" : min is : "+c.getValue().get().getMarks()));

        //avg marks per dept
        sList.stream().collect(Collectors.groupingBy(Student::getDept,Collectors.averagingInt(Student::getMarks)))
                .entrySet().stream().forEach( a-> System.out.println(a.getKey()+" : avg is : "+a.getValue()) );

        //top 5 student by marks
        sList.stream().sorted( (a,b)-> a.getMarks()<b.getMarks()?1:-1 ).limit(3).forEach(a->System.out.println(a.getName()));

        //top 2 students in each dept
        sList.stream().collect(Collectors.groupingBy(Student::getDept))
                .entrySet().stream().forEach( a -> a.getValue().stream().sorted( (b,c) -> b.getMarks()<c.getMarks()?1:-1 ).limit(2)
                        .forEach( d -> System.out.println(d.getDept()+" : "+d.getMarks())));
        System.out.println("......................................");

        // Que : Suppose you have a list of student grades, and each grade has a subject and a score.
        // Write a Java Stream program to find the average grade score for each subject.
        List<Grade> grades = Arrays.asList(
                new Grade("Math", 90),
                new Grade("Math", 85),
                new Grade("Science", 78),
                new Grade("Science", 92),
                new Grade("History", 88),
                new Grade("History", 95)
        );

        //Map<String,List<Grade>> gradesMap =
        grades.stream().collect(Collectors.groupingBy(Grade::getSubject))
                .entrySet().forEach( a -> System.out.println("By using .map() : "+a.getKey()+"--"+
                        a.getValue().stream().map( b -> b.getMarks())
                                .collect(Collectors.toList()).stream().mapToInt( c -> c ).average().getAsDouble()));

        //Map<String, Double> averageScoresBySubject =
        grades.stream()
                .collect(Collectors.groupingBy(
                        Grade::getSubject,
                        Collectors.averagingDouble(Grade::getMarks)
                )).entrySet().forEach( a -> System.out.println("By using Collectors.averagingDouble : "+a.getKey()+"---"+a.getValue()));
        System.out.println("......................................");

        //Question 3: Sales Data Analysis
        //Imagine you have sales data with information about products, salesperson names, and sales amounts.
        // Write a Java Stream program to group the data by product and find the salesperson who generated the highest sales for each product.
        Sales sales1 = new Sales("prod1","aaa",45);
        Sales sales2 = new Sales("prod2","bbb",78);
        Sales sales3 = new Sales("prod3","ccc",23);
        Sales sales4 = new Sales("prod2","aaa",39);
        Sales sales5 = new Sales("prod3","aaa",67);
        Sales sales6 = new Sales("prod2","ccc",38);
        List<Sales> salesList = new ArrayList<>();
        Collections.addAll(salesList,sales1,sales2,sales3,sales4,sales5,sales6);
        salesList.stream().collect(Collectors.groupingBy(Sales::getProduct,Collectors.maxBy( (a,b)->a.getAmount()>b.getAmount()?1:-1)))
                .entrySet().stream().forEach( c -> System.out.println("product : "+c.getKey()+" max amount : "+c.getValue().get().getAmount()));

        System.out.println("......................................");

        //Question 4: Finding Most Frequent Items
        //Given a list of items, create a Java Stream program to find the most frequent items in the list.
        // You can define the frequency as the number of times an item appears in the list.
        /* List<Integer> intList = new ArrayList<>();
        intList.addAll(3,5,3,6,8,6,8,9,3,5,8,5,8,7,5,4,3,6,9,7);
        intList.stream().collect(Collectors.groupingBy(Integer::new)).entrySet().stream().forEach();*/

        // Question 5: Order Processing
        //Suppose you have a list of customer orders with information about the order date, customer name, and order amount.
        // Write a Java Stream program to group the orders by year and customer name and calculate the total order amount for each combination.
        Order o1 = new Order("2022","aaa",78);
        Order o2 = new Order("2020","bbb",32);
        Order o3 = new Order("2023","ccc",47);
        Order o4 = new Order("2020","ddd",07);
        Order o5 = new Order("2023","eee",24);
        List<Order> orderList = new ArrayList<Order>();
        Collections.addAll(orderList,o1,o2,o3,o4,o5);

        orderList.stream().collect(Collectors.groupingBy( a -> a.getYear()
                , Collectors.summingInt( a -> a.getAmount())
                )).entrySet().stream().forEach( b -> System.out.println(b.getKey()+" : "+b.getValue()));
        System.out.println("......................................");


        //Given a list of strings, find all palindrome
        System.out.println(".........................Given a list of strings, find all palindrome...............");
        List<String> strList = new ArrayList<>();
        Collections.addAll(strList,"fdh","vfv","aba");
        strList.stream().filter( a -> (new StringBuffer(a)).reverse().toString().equals(a) ).forEach( System.out::println );
        System.out.println("......................................");

        //Given a list of strings, find all anagrams
        System.out.println(".........................Given a list of strings, find all anagrams...............");
        List<String> strList1 = new ArrayList<>();
        Collections.addAll(strList1,"listen","vfv","silent","enlist");
        strList1.stream().collect(Collectors.groupingBy(  a -> a.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining()) ))
                .entrySet().forEach( b -> b.getValue().stream().forEach( d -> System.out.println("anagram str of "+b.getKey()+" is :"+d)) );
        System.out.println("......................................");


    }


}



class Sales{
    String product;
    String person;
    int amount;

    public String getProduct() {
        return product;
    }

    public String getPerson() {
        return person;
    }

    public int getAmount() {
        return amount;
    }

    public Sales(String product, String person, int amount) {
        this.product = product;
        this.person = person;
        this.amount = amount;
    }
}


class Order{
    String year;
    String name;
    int amount;

    public Order(String year, String name, int amount) {
        this.year = year;
        this.name = name;
        this.amount = amount;
    }

    public String getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }
}

class Student{
    String name;
    int marks;
    String dept;

    public Student(String name, int marks, String dept) {
        this.name = name;
        this.marks = marks;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public String getDept() {
        return dept;
    }
}

class Grade{
    String subject;
    int marks;

    public Grade(String subject, int marks) {
        this.subject = subject;
        this.marks = marks;
    }

    public String getSubject() {
        return subject;
    }

    public int getMarks() {
        return marks;
    }
}