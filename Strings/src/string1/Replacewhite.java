/* This code are licened by @pratik*/

/**
 * Author @Pratik
 */
package string1;

/**
 * @author ANUJ
 *
 */
public class Replacewhite {

public static void main(String[] args) {
	String st="All about Today";
	System.out.println(st);
//	String st1=st.replaceFirst("\\s", "zmm");
	String st1=st.replaceAll("\\s"," @ ");
	System.out.println(st1);
	StringBuilder sb=new StringBuilder();
	sb.append(st1);
	sb.reverse();
	System.out.println(sb);
}
}
