#include <iostream.h> // COMBINĂRI
const MAX=20;
int n,p,v[MAX] ;
int solutie(int k);
void afisare(int k);
void BK(int k);
void main()
{cout<<"n= ";cin>>n; cout<<"p= ";cin>>p;
BK(1);
}
void BK(int k)
{int i;
for (i=v[k-1]+1;i<=n;i++) //la pasul k selectăm din mulţime un element mai mare decât elementul
 {v[k]=i; //de pe poziţia k-1
 if (solutie(k)) //nu este necesar să verificam condiţiile de continuare, ele sunt respectate
 afisare(k); //datorită modului în care am selectat elementele.
 else
 BK(k+1);
 }
}
int solutie(int k)
{if (k==p) return 1;
return 0;}
void afisare(int k)
{int i;
for (i=1;i<=k;i++) cout<<v[i]<<" ";
cout<<endl;
}