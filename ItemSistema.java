public class ItemSistema {
   public String nomeItem;
   private String tipoItem;
   private int complexidade = 1;


   public int CalculaQtdHoras() {
      int qtdHoras = switch (complexidade) {
         case 1 -> 24;
         case 2 -> 48;
         case 3 -> 72;
         default -> 96;
      };

      return qtdHoras;
   }

   public String getNomeItem() {
      return nomeItem;
   }

   public void setNomeItem(String nomeItem) {
      this.nomeItem = nomeItem;
   }

   public String getTipoItem() {
      return tipoItem;
   }

   public void setTipoItem(String tipoItem) {
      this.tipoItem = tipoItem;
   }

   public int getComplexidade() {
      return complexidade;
   }

   public void setComplexidade(int complexidade) {
      this.complexidade = complexidade;
   }

   

}
