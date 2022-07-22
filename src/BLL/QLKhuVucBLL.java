package BLL;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;


import DTO.KhuVucDTO;


public class QLKhuVucBLL {
	
	public static QLKhuVucBLL instance;
	private  QLKhuVucBLL() {
		
	}
	public static QLKhuVucBLL getInstance() {
		if (instance == null)
			instance = new QLKhuVucBLL();
		return instance;
	}

	public DefaultTableModel getResources() {
		ArrayList<KhuVucDTO> dsKhuVuc = new ArrayList<KhuVucDTO>();
		dsKhuVuc.add(new KhuVucDTO("kv1", "kv1", "Còn chỗ"));
		dsKhuVuc.add(new KhuVucDTO("kv2", "kv2", "Hết Chỗ"));
		dsKhuVuc.add(new KhuVucDTO("kv3", "kv3", "Còn chỗ"));
		DefaultTableModel dtm = new DefaultTableModel();
		try {
			dtm.addColumn("STT");
			dtm.addColumn("Mã Khu Vực");
			dtm.addColumn("Tên Khu Vực");
			dtm.addColumn("Tình Trạng");
			int i = 1;
			for(KhuVucDTO kv : dsKhuVuc) {
				if(kv.getTrangThaiKhuVuc().equals("Hết Chỗ")) {
					continue;
				}
				Object[] row = {i++, kv.getMaKhuvuc(), kv.getTenKhuVuc(), kv.getTrangThaiKhuVuc()};
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
