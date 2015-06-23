#include <bits/stdc++.h>
using namespace std;

int relation_matrix[10000][10000]={0};   // Boolean Relation Matrix
int size_A=0;   //Size of set A
int pairs;   //Number of pairs in relation set AxA

void is_reflexive(void)
{
    for(int i=0;i<=size_A;i++)
    {
        if(relation_matrix[i][i]!=1)
        {
            cout<<"The given relation is NOT Reflexive !!\n";
            return;
        }
    }
    cout<<"The given relation is Reflexive !!\n";
    return;
}

void is_symmetric(void)
{
    for(int i=0;i<=size_A;i++)
    {
        for(int j=0;j<=i;j++)
        {
            if(relation_matrix[i][j] != relation_matrix[j][i])
            {
                cout<<"The given relation is NOT Symmetric !!\n";
                return;
            }
        }
    }
    cout<<"The given relation is Symmetric !!\n";
    return;
}

void is_transitive(void)
{
    for(int i=0;i<=size_A;i++)
    {
        for(int j=0;j<=size_A;j++)
        {
            if(relation_matrix[i][j]==1)
            {
                for(int k=0;k<=size_A;k++)
                {
                    if(relation_matrix[j][k]==1 && relation_matrix[i][k]!=1)
                    {
                        cout<<"The given relation is NOT Transitive !!\n";
                        return;
                    }
                }
            }
        }
    }
    cout<<"The given relation is Transitive !!\n";
    return;
}

int main()
{
    cout<<"Enter the size of set A : ";
    cin>>size_A;
	cout<<"Enter the number of pairs in AxA relation set : ";
	cin>>pairs;

	cout<<"\n";

	int a,b;    //A pair in relation set AxA

	for(int i=0;i<pairs;i++)
	{
	   cout<<"Enter pair "<<i+1<<" of relation AxA : ";
	   cin>>a>>b;
	   relation_matrix[a][b]=1;
	}

	cout<<"\n";

	cout<<"The relation matrix AxA : \n";
	for(int i=0;i<=size_A;i++)
	{
	   for(int j=0;j<=size_A;j++)
	   {
	       cout<<relation_matrix[i][j]<<" ";
	   }
	   cout<<"\n";
	}

	cout<<"\n";

	int operation=9999;
	while(operation!=0)
	{
	    cout<<"Press 1 to check Reflexivity.\n";
	    cout<<"Press 2 to check Symmetricity.\n";
	    cout<<"Press 3 to check Transitivity.\n";
	    cout<<"Press 0 to end the program.\n";
	    cout<<"\n";
	    cin>>operation;
	    cout<<"\n";
	    if(operation==1)
	    {
	        is_reflexive();
	        cout<<"\n";
	    }
	    if(operation==2)
	    {
	        is_symmetric();
	        cout<<"\n";
	    }
	    if(operation==3)
	    {
	        is_transitive();
	        cout<<"\n";
	    }
	}
	return 0;
}