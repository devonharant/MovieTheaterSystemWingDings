
public class Theater {
		private String time;
		private boolean [][] seats;
		
		public Theater(Integer show, int rows, int cols, String time, String seats) {
			this.seats = new boolean[rows][cols];
			for(int i = 0; i < rows; i++) {
				for(int j = 0; j < cols; j++) 
					if(seats.charAt((i+1)*j)==('Y')) {
					this.seats[i][j]= false;
					}
					else
						this.seats[i][j]= true;
			}
			this.setTime(time);
		}
		
		public Theater(Integer show, int rows, int cols, String time) {
			this.seats = new boolean[rows][cols];
			for(int i = 0; i < rows; i++) {
				for(int j = 0; j < cols; j++) 
					this.seats[i][j]= false;
			}
			this.setTime(time);
		}
		// getters and setters
		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public boolean[][] getSeats() {
			return seats;
		}

		public void setSeats(boolean[][] seats) {
			this.seats = seats;
		}
		
	}