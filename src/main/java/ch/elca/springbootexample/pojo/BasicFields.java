package ch.elca.springbootexample.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

@MappedSuperclass
public abstract class BasicFields implements Serializable {
//TODO ask senior - how can I take here the ID also

    private static final long serialVersionUID = 3246747235324743685L;

    private boolean deleted;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar createdOn;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar updatedOn;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar deletedOn;

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Calendar getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Calendar createdOn) {
        this.createdOn = createdOn;
    }

    public Calendar getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Calendar updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Calendar getDeletedOn() {
        return deletedOn;
    }

    public void setDeletedOn(Calendar deletedOn) {
        this.deletedOn = deletedOn;
    }
}
