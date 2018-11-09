import java.util.Random;

class Room {
	public Room(){
		
	}
		// チュートリアル部屋
		public void TutorialRoom(){
		
		}
                //空部屋
                public void EmptyRoom(){
                    
                }
                //敵部屋
                public void EnemyRoom(){
                    
                }
                //宝部屋
                public void TresureRoom(){
                    Item item = new Item();
                }
                //罠部屋
                public void TrapRoom(Player player){
			Random r = new Random();
			r.nextInt(2);
			if(r==0){
				Player.setPoison();
			}else{
				Player.setHP(-2);
			}
                }
                //秘宝
		public void GoolRoom(){
                    
                }

}
