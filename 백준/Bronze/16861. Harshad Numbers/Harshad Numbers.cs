using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace backjoon
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            String s = Console.ReadLine();
            char[] ss = s.ToCharArray();

       
            int a = int.Parse(s);
            int sum = 0;
 
           
            for(int i = 0; i < ss.Length; i++)
            {
                sum = sum + (int)Char.GetNumericValue(ss[i]);
            }

            while (true)
            {
                if(a % sum == 0)
                {
                    break;
                }
                else
                {
                    a++;
                    ss = Convert.ToString(a).ToCharArray();
                    sum = 0;
                    for (int i = 0; i < ss.Length; i++)
                    {
                        sum = sum + (int)Char.GetNumericValue(ss[i]);
                    }
                }
            }

            Console.WriteLine(a);
        }
    }


}
