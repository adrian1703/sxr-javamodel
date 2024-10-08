package sxr.core.model.entities;

public abstract class SxrObject {
    long  sxrId;
    
    public void setSxrId(long id) { sxrId = id; }
    
    public long getSxrId() { return sxrId; }
}
