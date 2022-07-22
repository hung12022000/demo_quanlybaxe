package BLL;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import DTO.VeDTO;

public class QLVeBLL {
	public static QLVeBLL instance;
	private  QLVeBLL() {
		
	}
	public static QLVeBLL getInstance() {
		if (instance == null)
			instance = new QLVeBLL();
		return instance;
	}

	public DefaultTableModel getResources() {
		ArrayList<VeDTO> dsVe = new ArrayList<VeDTO>();
		dsVe.add(new VeDTO("123"));
		dsVe.add(new VeDTO("125"));
		dsVe.add(new VeDTO("128"));
		dsVe.add(new VeDTO("129"));
		dsVe.add(new VeDTO("130"));
		dsVe.add(new VeDTO("133"));
		DefaultTableModel dtm = new DefaultTableModel();
		try {
			
			dtm.addColumn("Mã Vé");
			for (VeDTO veDTO : dsVe) {
				Object row[] = {veDTO.getMaVe()};
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
