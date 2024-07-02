package words;

public class Words2 {
	
	public static void main(String[] args) {
		Dictionary2 webster = new Dictionary2(1500, 52500);
	
		System.out.println("Number of pages: " + webster.getPages());
		System.out.println("Number of definitions: " + webster.getDefintions());
		System.out.println("Defnitions per page: " + webster.computeRatio());
	
	}}
	class Book2{
		protected int pages;
			
			public Book2(int numPages) {
				pages = numPages;
			}
			
			public void setPages(int numPages) {
				pages = numPages;
			}
			
			public int getPages() {
				return pages;
			}
	}	
	
	class Dictionary2 extends Book2 {
		private int definitions;
		
		public Dictionary2(int numPages, int numDefinitions) {
			super(numPages);
			definitions = numDefinitions;
		}
	
		public double computeRatio() {
			return (double) definitions/pages;
		}
	
		public void setDefinitions(int numDefinitions) {
			definitions = numDefinitions;
		}
		
		public int getDefintions() {
			return definitions;
		}
		
	}
	
	
	

