import java.io.*; 
import java.util.*; 
import java.io.*;
import java.util.*;
class week3
{
public static void main(String args[])
{
int m,n,i,j,temp,p,max=0,total_profit=0;
int profit[]=new int[20];
int deadline[]=new int[20];
int sort[]=new int[20];
//int total_profit[]=new int[20];
int lp[]=new int[20];
int up[]=new int[20];
int pos[]=new int[20];
Scanner s=new Scanner(System.in);
System.out.println("Enter the no of Jobs:");
n=s.nextInt();

System.out.println("Enter the Profits for each Jobs:");
for(i=0;i<n;i++)
{
profit[i]=s.nextInt();
}
System.out.println("Enter the deadline for each Job:");
for(i=0;i<n;i++)
{
deadline[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
sort[i]=profit[i];
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if (sort[i]>sort[j])
{
temp=sort[i];
sort[i]=sort[j];
sort[j]=temp;
}
}
}
System.out.println("Array in descending order:");
System.out.println();
for(i=0;i<n;i++)
{
System.out.println(sort[i]);
}
for(i=0;i<n;i++)
{
p=sort[i];
for(j=0;j<n;j++)
{
if(p==profit[j])
{
pos[i]=j;
//System.out.println("pos="+pos[i]);
}
}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if (deadline[i]>deadline[j])
{
temp=deadline[i];
deadline[i]=deadline[j];
deadline[j]=temp;
}
max=deadline[0];
//System.out.println("Max deadline="+max);
}
}
System.out.println("Allocating time are:");
System.out.println();
for(i=0;i<max;i++)
{
lp[i]=i;
up[i]=i+1;
System.out.println(" "+lp[i]+" "+up[i]);
}
System.out.println();
for(i=0;i<n;i++)
{
//pos[i]=b[i];
if(up[i]!=0)
{
System.out.println();
System.out.println("for job "+pos[i]+" profit is "+sort[i]+" and deadline assign is "+lp[i]+"-"+up[i]);
total_profit=total_profit+sort[i];
//System.out.println("total profit="+total_profit);
}
}
System.out.println();
System.out.println("total_profit="+total_profit);
}
}
