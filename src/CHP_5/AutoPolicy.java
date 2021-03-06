package CHP_5;

public class AutoPolicy {
    public static void main(String[] args) {
// create two AutoPolicy objects
        AutoPolicyMethod policy1 = new AutoPolicyMethod(11111111, "Toyota Camry", "NJ");
        AutoPolicyMethod policy2 = new AutoPolicyMethod(22222222, "Ford Fusion", "ME" );
// display whether each policy is in a no-fault state
        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }
    // method that displays whether an AutoPolicy
// is in a state with no-fault auto insurance
    public static void policyInNoFaultState(AutoPolicyMethod policy) {
        System.out.println("The auto policy:");
        System.out.printf(
                "Account #: %d; Car: %s;%nState %s %s a no-fault state%n%n",
                policy.getAccountNumber(), policy.getMakeAndModel(),
                policy.getState(),
                (policy.isNoFaultState() ? "is": "is not") );
    }
}

