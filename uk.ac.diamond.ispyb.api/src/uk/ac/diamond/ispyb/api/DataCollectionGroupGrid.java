
package uk.ac.diamond.ispyb.api;

import java.util.Optional;

import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

@Generated("uk.ac.diamond.ispyb.generator.BeanGenerator")
public class DataCollectionGroupGrid {

    private long id;
    private long dcgId;
    private double dxInMm;
    private double dyInMm;
    private double stepsX;
    private double stepsY;
    private double meshAngle;
    private float pixelsPerMicronX;
    private float pixelsPerMicronY;
    private float snapshotOffsetXPixel;
    private float snapshotOffsetYPixel;
    private Orientation orientation;
    private int snaked;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getDcgId() {
        return this.dcgId;
    }

    public void setDcgId(long dcgId) {
        this.dcgId = dcgId;
    }

    public double getDxInMm() {
        return this.dxInMm;
    }

    public void setDxInMm(double dxInMm) {
        this.dxInMm = dxInMm;
    }

    public double getDyInMm() {
        return this.dyInMm;
    }

    public void setDyInMm(double dyInMm) {
        this.dyInMm = dyInMm;
    }

    public double getStepsX() {
        return this.stepsX;
    }

    public void setStepsX(double stepsX) {
        this.stepsX = stepsX;
    }

    public double getStepsY() {
        return this.stepsY;
    }

    public void setStepsY(double stepsY) {
        this.stepsY = stepsY;
    }

    public double getMeshAngle() {
        return this.meshAngle;
    }

    public void setMeshAngle(double meshAngle) {
        this.meshAngle = meshAngle;
    }

    public float getPixelsPerMicronX() {
        return this.pixelsPerMicronX;
    }

    public void setPixelsPerMicronX(float pixelsPerMicronX) {
        this.pixelsPerMicronX = pixelsPerMicronX;
    }

    public float getPixelsPerMicronY() {
        return this.pixelsPerMicronY;
    }

    public void setPixelsPerMicronY(float pixelsPerMicronY) {
        this.pixelsPerMicronY = pixelsPerMicronY;
    }

    public float getSnapshotOffsetXPixel() {
        return this.snapshotOffsetXPixel;
    }

    public void setSnapshotOffsetXPixel(float snapshotOffsetXPixel) {
        this.snapshotOffsetXPixel = snapshotOffsetXPixel;
    }

    public float getSnapshotOffsetYPixel() {
        return this.snapshotOffsetYPixel;
    }

    public void setSnapshotOffsetYPixel(float snapshotOffsetYPixel) {
        this.snapshotOffsetYPixel = snapshotOffsetYPixel;
    }

    public String getOrientation() {
        return Optional.ofNullable(orientation).map(x -> x.name()).orElse(null);
    }

    public void setOrientation(String orientation) {
        this.orientation = Orientation.valueOf(orientation);
    }

    public int getSnaked() {
        return this.snaked;
    }

    public void setSnaked(int snaked) {
        this.snaked = snaked;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

}
