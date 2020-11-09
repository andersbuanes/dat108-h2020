package d_deltagerform;

import java.util.List;

public interface DeltagerDAO {
	
	Deltager findByMobil(String mobil);
	List <Deltager> findAllOrderedByName();
	boolean isPaameldt(String mobil);
	void save(Deltager deltager);
}
