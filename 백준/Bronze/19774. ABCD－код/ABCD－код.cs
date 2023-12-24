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

            int n = Convert.ToInt16(Console.ReadLine());
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < n; i++)
            {

                char[] arr = Console.ReadLine().ToArray();

                String s1 = arr[0].ToString() + arr[1].ToString();
                String s2 = arr[2].ToString() + arr[3].ToString();

                int AB = Convert.ToInt16(s1);
                int CD = Convert.ToInt16(s2);

                int a = (int)(Math.Pow(AB, 2) + Math.Pow(CD, 2)) % 7;

                if(a == 1)
                {
                    sb.Append("YES\n");
                }
                else
                {
                    sb.Append("NO\n");
                }

            }

            Console.WriteLine(sb.ToString());

        }

    }
}
