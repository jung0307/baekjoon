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
            String[] s = Console.ReadLine().Split(" ");

            int n = Convert.ToInt16(s[0]);
            int sum = 0;

            switch (s[1]) {

                case "miss": sum = 0 * n; break;
                case "bad": sum = 200 * n; break;
                case "cool": sum = 400 * n; break;
                case "great": sum = 600 * n; break;
                case "perfect": sum = 1000 * n; break;

            }

            Console.WriteLine(sum);

        }

    }
}
