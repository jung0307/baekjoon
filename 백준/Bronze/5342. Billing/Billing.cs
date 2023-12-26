using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;

namespace backjoon
{
    internal class Program
    {

        public static void Main(string[] args)
        {
            String s = string.Empty;
            double sum = 0;

            while ( !(s = Console.ReadLine() ).Equals("EOI") ) { 
                
                switch(s)
                {
                    case "Paper": sum = sum + 57.99; break;
                    case "Printer": sum = sum + 120.50; break;
                    case "Planners": sum = sum + 31.25; break;
                    case "Binders": sum = sum + 22.50; break;
                    case "Calendar": sum = sum + 10.95; break;
                    case "Notebooks": sum = sum + 11.20; break;
                    case "Ink": sum = sum + 66.95; break;
                }
            }

            Console.WriteLine(string.Format("${0}" , sum));
        }

    }
}
