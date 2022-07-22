package BLL;

import java.sql.Date;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import DTO.RaVaoBenDTO;

public class QLRaVaoBenBLL {
	public static QLRaVaoBenBLL instance;
	private  QLRaVaoBenBLL() {
		
	}
	public static QLRaVaoBenBLL getInstance() {
		if (instance == null)
			instance = new QLRaVaoBenBLL();
		return instance;
	}

	public DefaultTableModel getResources() {
		ArrayList<RaVaoBenDTO> dsRaVaoBen = new ArrayList<RaVaoBenDTO>();
		dsRaVaoBen.add(new RaVaoBenDTO("1", "0001", "vt1", "kv1", "01234", new Date(2021-06-07)));
		dsRaVaoBen.add(new RaVaoBenDTO("1", "0001", "vt1", "kv1", "01234", new Date(2021-06-07)));
		dsRaVaoBen.add(new RaVaoBenDTO("1", "0001", "vt1", "kv1", "01234", new Date(2021-06-07)));
		dsRaVaoBen.add(new RaVaoBenDTO("1", "0001", "vt1", "kv1", "01234", new Date(2021-06-07)));
		dsRaVaoBen.add(new RaVaoBenDTO("1", "0001", "vt1", "kv1", "01234", new Date(2021-06-07)));
		dsRaVaoBen.add(new RaVaoBenDTO("1", "0001", "vt1", "kv1", "01234", new Date(2021-06-07)));
		DefaultTableModel dtm = new DefaultTableModel();
		try {
			dtm.addColumn("STT");
			dtm.addColumn("Mã Vé");
			dtm.addColumn("Tên Vị Trí");
			dtm.addColumn("Tên Khu Vực");
			dtm.addColumn("Biển Số");
			dtm.addColumn("Thời Gian Vào");
			int i = 0;
			for (RaVaoBenDTO raVaoBenDTO : dsRaVaoBen) {
				Object[] row = {i++, raVaoBenDTO.getMaVe(), raVaoBenDTO.getTenViTri(), raVaoBenDTO.getTenKhuVuc(), raVaoBenDTO.getBienSoXe(), raVaoBenDTO.getNgayVao()};
				dtm.addRow(row);
			}
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			
		}
		return dtm;
	}
}
