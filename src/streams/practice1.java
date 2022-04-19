package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class practice1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
list.add("Akash");
list.add("Akashy");
list.add("Akashraj");
list.add("kash");
list.add("kash");
long c=list.stream().filter(s-> s.startsWith("A")).count();
System.out.println(c);
long k=Stream.of("akash","kherade","raj").filter(s1->
{
	s1.startsWith("A");
	return true;
	}).count();
System.out.println(k);
list.stream().filter(s3-> s3.length()>5).limit(1).forEach(s3->System.out.println(s3));
list.stream().filter(s-> s.endsWith("h")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
List<String> al=Arrays.asList("akash","akash","Raj","Ak");
al.stream().filter(s->s.endsWith("h")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
Stream <String>s1=Stream.concat(list.stream(),Stream.of("akash","akash","Raj","Ak"));
s1.forEach(s->System.out.println(s));
List <Integer>ak= Arrays.asList(9,7,7,5,5,4,1,2,3);
List <Integer> st=ak.stream().sorted().distinct().collect(Collectors.toList());
System.out.println(st.get(3));

	}

}
