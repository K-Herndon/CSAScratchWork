public class NoSunshine{
public static void main(String[] args)
{
String x="\n";
String b="Ain't no sunshine when she's gone";
String c="Anytime she goes away"+x;
String d="I know, ";
String e=d.repeat(4)+x;
String f=d.repeat(5)+x;
String g=f.repeat(4);
a(b);
a("It's not warm when she's away");
a(b);
a("And she's always gone too long"+x+c);
a("Wonder this time where she's gone");
a("Wonder if she's gone to stay");
a(b);
a("And this house just ain't no home"+x+c);
a("And "+e+g+d+d+x);
a("Hey, I ought to leave young thing alone"+x+"But ain't no sunshine when she's gone, whoa-whoa"+x+b+x+"Only darkness every day"+x+x+b+x+"And this house just ain't no home"+x+x+c+c+c+"Anytime she goes away");
}
public static void a(String h)
{
System.out.println(h);
}
}