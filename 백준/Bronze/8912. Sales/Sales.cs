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
            int n = Convert.ToInt32(Console.ReadLine());
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < n; i++)
            {
                Console.ReadLine();
                String s = Console.ReadLine();
                String[] arr = s.Split(" "); 

                int cnt = 0;

                for (int j = 1; j < arr.Length; j++)
                {
                    for (int k = 0; k < j; k++)
                    {
                        if ((Convert.ToInt16(arr[j])) >= (Convert.ToInt16(arr[k])))
                        {
                            cnt++;
                        }
                    }
                }

                sb.Append(cnt + "\n");

            }

            Console.WriteLine(sb.ToString());

        }
    }
}
