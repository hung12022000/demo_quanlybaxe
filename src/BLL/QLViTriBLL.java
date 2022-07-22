package BLL;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import DTO.ViTriDTO;

public class QLViTriBLL {
	public static QLViTriBLL instance;
	private  QLViTriBLL() {
		
	}
	public static QLViTriBLL getInstance() {
		if (instance == null)
			instance = new QLViTriBLL();
		return instance;
	}

	public DefaultTableModel getResources(String tenKhuVuc) {
		ArrayList<ViTriDTO> dsViTri = new ArrayList<ViTriDTO>();
		dsViTri.add(new ViTriDTO("vt1", "vt1", "kv1", "Trống"));
		dsViTri.add(new ViTriDTO("vt2", "vt2", "kv1", "-1"));
		dsViTri.add(new ViTriDTO("vt3", "vt3", "kv1", "Trống"));
		dsViTri.add(new ViTriDTO("vt4", "vt4", "kv1", "Trống"));
		dsViTri.add(new ViTriDTO("vt1", "vt1", "kv2", "-1"));
		dsViTri.add(new ViTriDTO("vt1", "vt1", "kv3", "Trống"));
		dsViTri.add(new ViTriDTO("vt2", "vt2", "kv3", "Trống"));
		DefaultTableModel dtm = new DefaultTableModel();
		try {
			dtm.addColumn("STT");
			dtm.addColumn("Mã Vị Trí");
			dtm.addColumn("Tên Vị Trí");
			dtm.addColumn("Khu Vực");
			dtm.addColumn("Tình Trạng");
			int i = 1;
			for (ViTriDTO vt : dsViTri) {
				if(vt.getTenKhuVuc().equals(tenKhuVuc) == false || vt.getTrangThaiViTri().equals("-1")) {
					continue;
				}
				Object[] row = {i++, vt.getMaViTri(), vt.getTenViTri(), vt.getTenKhuVuc(), vt.getTrangThaiViTri()};
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
