public interface IPlacaMae {
   String mostrarTipoPlacaMae(); 
   String mostrarFabricante(); 
   int mostrarQuantidadeControladorasSata();
   void ativarRaid(String raidAtivado);
   void desativarRaid(String raidDesativado); 
   int mostrarQuantidadeUSBs();
}
