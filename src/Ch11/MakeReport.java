package Ch11;

public class MakeReport {
	
	StringBuffer buffer = new StringBuffer();
	
	public MakeReport() {}
	
	private String line = "=====================================\n";
	private String title = "이름\t주소\t\t전화번호\n";
	private void makeHeader() {
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	
	private void generateBody() {
		buffer.append("James \t");
		buffer.append("Seoul Korea \t");
		buffer.append("010-1111-2222\n");
		
		buffer.append("Naba \t");
		buffer.append("NewYork \t");
		buffer.append("010-3333-8888\n");
	}
	
	private void makeFooter() {
		buffer.append(line);
	}
	
	public String getReport() {
		makeHeader();
		generateBody();
		makeFooter();
		return buffer.toString();
	}
}
