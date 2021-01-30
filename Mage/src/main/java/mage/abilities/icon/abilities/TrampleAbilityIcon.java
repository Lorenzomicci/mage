package mage.abilities.icon.abilities;

import mage.abilities.icon.CardIcon;
import mage.abilities.icon.CardIconType;

/**
 * @author JayDi85
 */
public enum TrampleAbilityIcon implements CardIcon {
    instance;

    @Override
    public CardIconType getIconType() {
        return CardIconType.ABILITY_TRAMPLE;
    }

    @Override
    public String getText() {
        return "";
    }

    @Override
    public String getHint() {
        return "Trumple ability";
    }

    @Override
    public CardIcon copy() {
        return instance;
    }
}
