/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.mavenproject3;

/**
 *
 * @author Mpho Sefoloko
 * 218336322
 */
public class SchoolFees {
    private String learnerId, learnerName, feeAmount;

    public String getLearnerId() {
        return learnerId;
    }

    public void setLearnerId(String learnerId) {
        this.learnerId = learnerId;
    }

    public String getLearnerName() {
        return learnerName;
    }

    public void setLearnerName(String learnerName) {
        this.learnerName = learnerName;
    }

    public String getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }

    @Override
    public String toString() {
        return "SchoolFees{" + "learnerId=" + learnerId + ", learnerName=" + learnerName + ", feeAmount=" + feeAmount + '}';
    }
    
}

