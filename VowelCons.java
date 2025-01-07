public class VowelCons {
    public static void main(String[] args) {
        String text="Hi NUpUr how are you?";
        int Vcount=0;
        int Ccount=0;
        for(int i=0;i<text.length();i++)
        {
            if(text.charAt(i)=='i'||text.charAt(i)=='u'||text.charAt(i)=='a'||text.charAt(i)=='e'||text.charAt(i)=='o'||text.charAt(i)=='I'||text.charAt(i)=='U'||text.charAt(i)=='A'||text.charAt(i)=='E'||text.charAt(i)=='O')
            {
                Vcount++;
    
            }
           else if(text.charAt(i)!='a'||text.charAt(i)!='e'||text.charAt(i)!='i'||text.charAt(i)!='o'||text.charAt(i)!='u'||text.charAt(i)!='A'||text.charAt(i)!='E'||text.charAt(i)!='I'||text.charAt(i)!='O'||text.charAt(i)!='U')
           {
            Ccount++;
           }
        }
        System.out.println("In a provided string Vowel count is : "+Vcount);
        System.out.println("In a provided string Consonant count is : "+Ccount);
    }
}
