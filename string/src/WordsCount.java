class WordsCount
{
public static void main(String[] args)
{
int words = 1;

String str = "India is a really fast growing economy";
System.out.println(str);

int count = str.length();


for(int i=0;i<count;i++)
{

if(str.charAt(i)==' ')
{
words++;

}

}
System.out.println("The words of str count contain is :"+" "+words);


}
}