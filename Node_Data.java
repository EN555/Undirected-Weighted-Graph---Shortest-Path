package ex1;

import java.util.HashMap;


public class Node_Data implements node_info {
	int key;
	String info;
	double tag;
	private HashMap<Integer, Double> neighbor;
	private static int num_nodes=0;	
	
	// constructors
	public Node_Data(int key,String info,double tag,HashMap<Integer, Double> hashMap)		//constructor that get all the parameters 
	{		
		this.neighbor= new HashMap<Integer, Double>(hashMap);
		this.key =key;
		this.info=info;
		this.tag=tag;
		num_nodes++;
	}
		
	public Node_Data(String info)
	{
		this(num_nodes,info,0,new HashMap<Integer,Double>());
	}

	public Node_Data()
	{				
		this( "");
	}
		
	public Node_Data(int key,String info) 
	{
		this(key,info,0,new HashMap<Integer,Double>());
	}
		
	public Node_Data(int key) 
	{
		this(key,"",0,new HashMap<Integer,Double>());
	}
		
	private Node_Data(String info,int tag) 
	{
		this(num_nodes,info,0,new HashMap<Integer,Double>());
	}
		
		//copy constructor
	public Node_Data(Node_Data copy) 								
	{																		
		this(copy.key,copy.info, copy.tag, copy.neighbor);
	}

	@Override
	public int getKey() {
		// TODO Auto-generated method stub
		return this.key;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return this.info;
	}

	@Override
	public void setInfo(String s) {
		// TODO Auto-generated method stub
		this.info=s;
	}

	@Override
	public double getTag() {
		// TODO Auto-generated method stub
		return this.tag;
	}

	@Override
	public double setTag(int t) {					
		// TODO Auto-generated method stub
		this.tag=t;
		return t;
	}
	public HashMap<Integer, Double> GetNi() {
		return this.neighbor;
	}

}
