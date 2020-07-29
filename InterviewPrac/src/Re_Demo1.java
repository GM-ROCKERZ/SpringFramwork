import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Re_Demo1 {
	
public static void main(String args[]) {
	
	Pattern p =  Pattern.compile("ab");
	Matcher m = p.matcher("ababdjaanab");
	
	while(m.find()) {
		
		System.out.println(m.start()+"--->"+m.end()+"--->"+m.group() );
	}

}	

}
