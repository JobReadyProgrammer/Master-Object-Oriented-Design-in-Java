
public class Vehicle {

	private String type;
	private String make;
	private String model;
	private double price;
	private int doors;
	private String color;
	private int horsePower;
	
	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", make=" + make + ", model=" + model
				+ ", price=" + price + ", doors=" + doors + ", color=" + color
				+ ", horsePower=" + horsePower + "]";
	}

	private Vehicle(Builder builder){
		this.type = builder.type;
		this.make = builder.make;
		this.model = builder.model;
		this.price = builder.price;
		this.doors = builder.doors;
		this.color = builder.color;
		this.horsePower = builder.horsePower;
	}
	
	public static class Builder{
	
		private String type;
		private String make;
		private String model;
		private double price;
		private int doors;
		private String color;
		private int horsePower;
	
		public Builder type(String value){
			this.type = value;
			return this;
		}
		public Builder make(String value){
			this.make = value;
			return this;
		}
		public Builder model(String value){
			this.model = value;
			return this;
		}
		public Builder price(double value){
			this.price = value;
			return this;
		}
		public Builder doors(int value){
			this.doors = value;
			return this;
		}
		public Builder color(String value){
			this.color = value;
			return this;
		}
		public Builder horsePower(int value){
			this.horsePower = value;
			return this;
		}
	
		public Vehicle build(){
			return new Vehicle(this);
		}

		
	}
}
