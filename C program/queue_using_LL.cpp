//**********************************queue using linklist*************************//
#include<stdio.h>
#include<stdlib.h>
#include<conio.h>

struct node{
	int data;
	struct node* next;
};
struct node* head = NULL;
void peek(){
	struct node* front= head;
	if(front==NULL){
		printf("queue is Empty\n");
		return;
	}
	else{
		printf("The data at front is:%d\n",front->data);
	}
}
	



void enqueue(){
	int value;
	printf("enter the data to store\n");
    scanf("%d",&value);
	struct node *newnode=(struct node*)malloc(sizeof(struct node));
	struct node *current=head;
	newnode->data=value;
	newnode->next=NULL;
	if(head==NULL){
		head=newnode;
	}
	else{
		while(current->next!=NULL){
			current=current->next;
		}
		current->next=newnode;
		printf("the data is stored\n");
	}
}

void dequeue(){
	struct node* front= head;
	if(front==NULL){
		printf("queue is Empty\n");
		return;
	}
	else{
		head=head->next;
		free(front);
		front=NULL;
	}
}

void display(){
	struct node *ptr= head;
		if(head==NULL){
		printf("queue is Empty\n");
		return;
         }
		 
		else{
			while(ptr!=NULL){
				printf("%d\n",ptr->data);
				ptr= ptr->next;
				
			}
		} 
	

}

int main(){
	int choice;
	
	while(1)
{
printf("please enter the choice of operation\n 1.enqueue \n 2.dequeue \n 3.display \n 4.Front data \n 5.Exit\n");
scanf("%d",&choice);
switch(choice)
{
case 1: enqueue();
      break;
  
case 2: dequeue();
      break;

case 3: display();
      break;      

case 4: peek();
       break;
      
case 5: exit(0);
       break;   
   
   default: printf("please enter valid choice\n");
            
}
}

}