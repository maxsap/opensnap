package service;

import domain.Snap;

import java.util.List;

public interface SnapService {
    public Snap create(Snap snap);
	public Snap getSnapById(int id);
	public List<Snap> getSnapsFromRecipient(String username);
    public void delete(int id);
}
