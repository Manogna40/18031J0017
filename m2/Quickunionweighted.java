


public class Quickunionweighted
	{
		public int[] id;
		public int[] sz;
		Quickunionweighted()
		{
			
		}
		public Quickunionweighted(int Noo[],int N)
		{
			sz=new int[N];
			id = new int[N];
			for(int i = 0 ; i < N ; i++)
				if(Noo[i]==0)
				{
					id[i]=i;
				}
				else
				{
				id[i] = Noo[i] ;
				}
		}
		@SuppressWarnings("unused")
		private int Root(int i)
		{
			while(i!=id[i])
			{
				i=id[i];
				
			}
			return i;
		}
			public boolean Find(int p , int q)
			{
				return Root(p) == Root(q);
			}
			public void union(int p , int q)
			{
				int i = id[p];
				int j = id[q];
				//id[pid]=qid;
				if(sz[i]<sz[j])
				{
					id[i]=j;
					sz[j]+=sz[i];
					
				}
				else
				{
					id[j]=i;
					sz[i]+=sz[j];
				}
				for(int i1 = 0 ; i1<10 ; i1++)
				{
					System.out.print(id[i1] + " ");	
			    }
				System.out.println("");
			}
				
		
	}
