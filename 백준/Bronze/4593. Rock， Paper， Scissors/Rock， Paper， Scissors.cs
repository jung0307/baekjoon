using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace backjoon
{
    internal class Program
    {

        public static void Main(string[] args) {

            String s1 = "";
            String s2 = "";

            StringBuilder sb = new StringBuilder();

            while (true)
            {
                s1 = Console.ReadLine();
                s2 = Console.ReadLine();

                if(s1.Equals("E") &&  s2.Equals("E"))
                {
                    break;
                }

                char[] arr1 = s1.ToCharArray();
                char[] arr2 = s2.ToCharArray();

                int cnt1 = 0;
                int cnt2 = 0;

                for (int i = 0; i < arr1.Length; i++)
                {

                    if (arr1[i] == 'R')
                    {
                        if (arr2[i] == 'S')
                        {
                            cnt1++;
                        }
                        else if (arr2[i] == 'P')
                        {
                            cnt2++;
                        }
                    }
                    else if (arr1[i] == 'S')
                    {
                        if (arr2[i] == 'P')
                        {
                            cnt1++;
                        }
                        else if (arr2[i] == 'R')
                        {
                            cnt2++;
                        }
                    }
                    else if (arr1[i] == 'P')
                    {
                        if (arr2[i] == 'R')
                        {
                            cnt1++;
                        }
                        else if (arr2[i] == 'S')
                        {
                            cnt2++;
                        }

                    }
                }

                sb.Append("P1: " + cnt1 + "\n");
                sb.Append("P2: " + cnt2 + "\n");
            }

            Console.WriteLine(sb.ToString());
        }

    }
}
