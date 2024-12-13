#include<cstdio>

#include<iostream>
using namespace std;
void sum( int num1, int num2 ){
int result = num1 + num2;
cout << "Result : " << result << endl;
 }
void sum( int num1, int num2, int num3 ){
int result = num1 + num2 + num3;
cout << "Result : " << result << endl;
 }
void sum( int num1, int num2, int num3, int num4 ){
int result = num1 + num2 + num3 + num4;
cout << "Result : " << result << endl;
 }
void sum( int num1, int num2, int num3, int num4, int num5 ){
int result = num1 + num2 + num3 + num4 + num5;
cout << "Result : " << result << endl;
 }
int main( void ){
 sum( 10, 20 );
 sum( 10, 20, 30 );
 sum( 10, 20, 30, 40 );
 sum( 10, 20, 30, 40, 50);
return 0;
 }
