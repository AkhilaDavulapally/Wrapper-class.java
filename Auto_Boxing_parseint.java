package com.Wrapper_classes;
public class Auto_Boxing_parseint {
		public static void main(String[] args) {
			int a=20;
			double b=2.567;
			float c=2.0f;
			Integer a1=Integer.parseInt(a+"");
			Double b1=Double.parseDouble(b+"");
			Float c1=Float.parseFloat(c+"");
			System.out.println(a+"->Non primitive:"+a1);
			System.out.println(b+"->Non primitive:"+b1);
			System.out.println(c+"->Non primitive:"+c1);
		}
		}

