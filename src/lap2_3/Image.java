package lap2_3;

public class Image {
	private int width; // in pixels
	private int height; // in pixels
	private String source; // file name
	private  String quality; // informal
	 public Image(int width, int height, String source, String quality) {
		super();
		this.width = width;
		this.height = height;
		this.source = source;
		this.quality = quality;
	 }
	public boolean isPortrait () {
		return this.height > this.width ;
	}
	public int size () {
		return this.width * this.height ;
	}
	public boolean isLarger (Image other) {
		return this.size() > other.size() ;
	}
	public boolean same (Image other) {
		return this.width == other.width &&
				   this.height == other.height &&
				   this.source.equals(other.source) &&
				   this.quality.equals(other.quality);
	}
	public String sizeString() {
		int pixel = this.size();
		if (pixel <= 10000) {
			return "small";
		} else if (pixel <=1000000) {
			return "medium" ;
		} else {
			return "large";
		      }
		}
	
}
