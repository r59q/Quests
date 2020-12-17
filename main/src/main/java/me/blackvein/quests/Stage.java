/*******************************************************************************************************
 * Continued by PikaMug (formerly HappyPikachu) with permission from _Blackvein_. All rights reserved.
 * 
 * THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN
 * NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY
 * OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *******************************************************************************************************/

package me.blackvein.quests;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

import me.blackvein.quests.actions.Action;
import me.blackvein.quests.conditions.Condition;
import me.blackvein.quests.enums.ObjectiveType;

public class Stage {

    protected LinkedList<ItemStack> blocksToBreak = new LinkedList<ItemStack>();
    protected LinkedList<ItemStack> blocksToDamage = new LinkedList<ItemStack>();
    protected LinkedList<ItemStack> blocksToPlace = new LinkedList<ItemStack>();
    protected LinkedList<ItemStack> blocksToUse = new LinkedList<ItemStack>();
    protected LinkedList<ItemStack> blocksToCut = new LinkedList<ItemStack>();
    protected Integer cowsToMilk;
    protected Integer fishToCatch;
    protected Integer playersToKill;
    protected LinkedList<ItemStack> itemsToCraft = new LinkedList<ItemStack>();
    protected LinkedList<ItemStack> itemsToSmelt = new LinkedList<ItemStack>();
    protected LinkedList<ItemStack> itemsToEnchant = new LinkedList<ItemStack>();
    protected LinkedList<ItemStack> itemsToBrew = new LinkedList<ItemStack>();
    protected LinkedList<ItemStack> itemsToConsume = new LinkedList<ItemStack>();
    protected LinkedList<ItemStack> itemsToDeliver = new LinkedList<ItemStack>();
    protected LinkedList<Integer> itemDeliveryTargets = new LinkedList<Integer>() {

        private static final long serialVersionUID = -2774443496142382127L;

        @Override
        public boolean equals(final Object o) {
            if (o instanceof LinkedList) {
                @SuppressWarnings("unchecked")
                final
                LinkedList<Integer> otherList = (LinkedList<Integer>) o;
                for (final Integer i : this) {
                    final Integer other = otherList.get(this.indexOf(i));
                    if (!other.equals(i)) {
                        return false;
                    }
                }
            }
            return true;
        }
    };
    protected  LinkedList<String> deliverMessages = new LinkedList<String>();
    protected LinkedList<Integer> citizensToInteract = new LinkedList<Integer>() {

        private static final long serialVersionUID = -4086855121042524435L;

        @Override
        public boolean equals(final Object o) {
            if (o instanceof LinkedList) {
                @SuppressWarnings("unchecked")
                final
                LinkedList<Integer> otherList = (LinkedList<Integer>) o;
                for (final Integer i : this) {
                    final Integer other = otherList.get(this.indexOf(i));
                    if (!other.equals(i)) {
                        return false;
                    }
                }
            }
            return true;
        }
    };
    protected LinkedList<Integer> citizensToKill = new LinkedList<Integer>() {

        private static final long serialVersionUID = 7705964814014176415L;

        @Override
        public boolean equals(final Object o) {
            if (o instanceof LinkedList) {
                @SuppressWarnings("unchecked")
                final
                LinkedList<Integer> otherList = (LinkedList<Integer>) o;
                for (final Integer i : this) {
                    final Integer other = otherList.get(this.indexOf(i));
                    if (!other.equals(i)) {
                        return false;
                    }
                }
            }
            return true;
        }
    };
    protected LinkedList<Integer> citizenNumToKill = new LinkedList<Integer>();
    protected LinkedList<EntityType> mobsToKill = new LinkedList<EntityType>();
    protected LinkedList<Integer> mobNumToKill = new LinkedList<Integer>();
    protected LinkedList<Location> locationsToKillWithin = new LinkedList<Location>();
    protected LinkedList<Integer> radiiToKillWithin = new LinkedList<Integer>();
    protected LinkedList<String> killNames = new LinkedList<String>();
    protected LinkedList<Location> locationsToReach = new LinkedList<Location>();
    protected LinkedList<Integer> radiiToReachWithin = new LinkedList<Integer>();
    protected LinkedList<World> worldsToReachWithin = new LinkedList<World>();
    protected LinkedList<String> locationNames = new LinkedList<String>();
    protected Map<EntityType, Integer> mobsToTame = new EnumMap<EntityType, Integer>(EntityType.class);
    protected Map<DyeColor, Integer> sheepToShear = new EnumMap<DyeColor, Integer>(DyeColor.class);
    protected LinkedList<String> passwordDisplays = new LinkedList<String>();
    protected LinkedList<LinkedList<String>> passwordPhrases = new LinkedList<LinkedList<String>>();
    protected String script;
    protected Action startAction = null;
    protected Action finishAction = null;
    protected Action failAction = null;
    protected Action deathAction = null;
    protected Map<String, Action> chatActions = new HashMap<String, Action>();
    protected Map<String, Action> commandActions = new HashMap<String, Action>();
    protected Action disconnectAction = null;
    protected Condition condition = null;
    protected long delay = -1;
    protected String delayMessage = null;
    protected String completeMessage = null;
    protected String startMessage = null;
    protected LinkedList<String> objectiveOverrides = new LinkedList<String>();
    protected LinkedList<CustomObjective> customObjectives = new LinkedList<CustomObjective>();
    protected LinkedList<Integer> customObjectiveCounts = new LinkedList<Integer>();
    protected LinkedList<String> customObjectiveDisplays = new LinkedList<String>();
    protected LinkedList<Entry<String, Object>> customObjectiveData = new LinkedList<Entry<String, Object>>();
    
    public LinkedList<ItemStack> getBlocksToBreak() {
        return blocksToBreak;
    }

    public void setBlocksToBreak(final LinkedList<ItemStack> blocksToBreak) {
        this.blocksToBreak = blocksToBreak;
    }

    public LinkedList<ItemStack> getBlocksToDamage() {
        return blocksToDamage;
    }

    public void setBlocksToDamage(final LinkedList<ItemStack> blocksToDamage) {
        this.blocksToDamage = blocksToDamage;
    }

    public LinkedList<ItemStack> getBlocksToPlace() {
        return blocksToPlace;
    }

    public void setBlocksToPlace(final LinkedList<ItemStack> blocksToPlace) {
        this.blocksToPlace = blocksToPlace;
    }

    public LinkedList<ItemStack> getBlocksToUse() {
        return blocksToUse;
    }

    public void setBlocksToUse(final LinkedList<ItemStack> blocksToUse) {
        this.blocksToUse = blocksToUse;
    }

    public LinkedList<ItemStack> getBlocksToCut() {
        return blocksToCut;
    }

    public void setBlocksToCut(final LinkedList<ItemStack> blocksToCut) {
        this.blocksToCut = blocksToCut;
    }
    
    public Integer getCowsToMilk() {
        return cowsToMilk;
    }

    public void setCowsToMilk(final Integer cowsToMilk) {
        this.cowsToMilk = cowsToMilk;
    }

    public Integer getFishToCatch() {
        return fishToCatch;
    }

    public void setFishToCatch(final Integer fishToCatch) {
        this.fishToCatch = fishToCatch;
    }

    public Integer getPlayersToKill() {
        return playersToKill;
    }

    public void setPlayersToKill(final Integer playersToKill) {
        this.playersToKill = playersToKill;
    }
    
    public LinkedList<ItemStack> getItemsToCraft() {
        return itemsToCraft;
    }

    public void setItemsToCraft(final LinkedList<ItemStack> itemsToCraft) {
        this.itemsToCraft = itemsToCraft;
    }
    
    public LinkedList<ItemStack> getItemsToSmelt() {
        return itemsToSmelt;
    }

    public void setItemsToSmelt(final LinkedList<ItemStack> itemsToSmelt) {
        this.itemsToSmelt = itemsToSmelt;
    }

    public LinkedList<ItemStack> getItemsToEnchant() {
        return itemsToEnchant;
    }

    public void setItemsToEnchant(final LinkedList<ItemStack> itemsToEnchant) {
        this.itemsToEnchant = itemsToEnchant;
    }
    
    public LinkedList<ItemStack> getItemsToBrew() {
        return itemsToBrew;
    }

    public void setItemsToBrew(final LinkedList<ItemStack> itemsToBrew) {
        this.itemsToBrew = itemsToBrew;
    }
    
    public LinkedList<ItemStack> getItemsToConsume() {
        return itemsToBrew;
    }

    public void setItemsToConsume(final LinkedList<ItemStack> itemsToBrew) {
        this.itemsToBrew = itemsToBrew;
    }

    public LinkedList<ItemStack> getItemsToDeliver() {
        return itemsToDeliver;
    }

    public void setItemsToDeliver(final LinkedList<ItemStack> itemsToDeliver) {
        this.itemsToDeliver = itemsToDeliver;
    }

    public LinkedList<Integer> getItemDeliveryTargets() {
        return itemDeliveryTargets;
    }

    public void setItemDeliveryTargets(final LinkedList<Integer> itemDeliveryTargets) {
        this.itemDeliveryTargets = itemDeliveryTargets;
    }

    public LinkedList<String> getDeliverMessages() {
        return deliverMessages;
    }

    public void setDeliverMessages(final LinkedList<String> deliverMessages) {
        this.deliverMessages = deliverMessages;
    }

    public LinkedList<Integer> getCitizensToInteract() {
        return citizensToInteract;
    }

    public void setCitizensToInteract(final LinkedList<Integer> citizensToInteract) {
        this.citizensToInteract = citizensToInteract;
    }

    public LinkedList<Integer> getCitizensToKill() {
        return citizensToKill;
    }

    public void setCitizensToKill(final LinkedList<Integer> citizensToKill) {
        this.citizensToKill = citizensToKill;
    }

    public LinkedList<Integer> getCitizenNumToKill() {
        return citizenNumToKill;
    }

    public void setCitizenNumToKill(final LinkedList<Integer> citizenNumToKill) {
        this.citizenNumToKill = citizenNumToKill;
    }

    public LinkedList<EntityType> getMobsToKill() {
        return mobsToKill;
    }

    public void setMobsToKill(final LinkedList<EntityType> mobsToKill) {
        this.mobsToKill = mobsToKill;
    }

    public LinkedList<Integer> getMobNumToKill() {
        return mobNumToKill;
    }

    public void setMobNumToKill(final LinkedList<Integer> mobNumToKill) {
        this.mobNumToKill = mobNumToKill;
    }

    public LinkedList<Location> getLocationsToKillWithin() {
        return locationsToKillWithin;
    }

    public void setLocationsToKillWithin(final LinkedList<Location> locationsToKillWithin) {
        this.locationsToKillWithin = locationsToKillWithin;
    }

    public LinkedList<Integer> getRadiiToKillWithin() {
        return radiiToKillWithin;
    }

    public void setRadiiToKillWithin(final LinkedList<Integer> radiiToKillWithin) {
        this.radiiToKillWithin = radiiToKillWithin;
    }
    
    public LinkedList<String> getKillNames() {
        return killNames;
    }

    public void setKillNames(final LinkedList<String> killNames) {
        this.killNames = killNames;
    }

    public LinkedList<Location> getLocationsToReach() {
        return locationsToReach;
    }

    public void setLocationsToReach(final LinkedList<Location> locationsToReach) {
        this.locationsToReach = locationsToReach;
    }

    public LinkedList<Integer> getRadiiToReachWithin() {
        return radiiToReachWithin;
    }

    public void setRadiiToReachWithin(final LinkedList<Integer> radiiToReachWithin) {
        this.radiiToReachWithin = radiiToReachWithin;
    }

    public LinkedList<World> getWorldsToReachWithin() {
        return worldsToReachWithin;
    }

    public void setWorldsToReachWithin(final LinkedList<World> worldsToReachWithin) {
        this.worldsToReachWithin = worldsToReachWithin;
    }

    public LinkedList<String> getLocationNames() {
        return locationNames;
    }

    public void setLocationNames(final LinkedList<String> locationNames) {
        this.locationNames = locationNames;
    }

    public Map<EntityType, Integer> getMobsToTame() {
        return mobsToTame;
    }

    public void setMobsToTame(final Map<EntityType, Integer> mobsToTame) {
        this.mobsToTame = mobsToTame;
    }

    public Map<DyeColor, Integer> getSheepToShear() {
        return sheepToShear;
    }

    public void setSheepToShear(final Map<DyeColor, Integer> sheepToShear) {
        this.sheepToShear = sheepToShear;
    }

    public LinkedList<String> getPasswordDisplays() {
        return passwordDisplays;
    }

    public void setPasswordDisplays(final LinkedList<String> passwordDisplays) {
        this.passwordDisplays = passwordDisplays;
    }

    public LinkedList<LinkedList<String>> getPasswordPhrases() {
        return passwordPhrases;
    }

    public void setPasswordPhrases(final LinkedList<LinkedList<String>> passwordPhrases) {
        this.passwordPhrases = passwordPhrases;
    }

    public String getScript() {
        return script;
    }

    public void setScript(final String script) {
        this.script = script;
    }

    public Action getStartAction() {
        return startAction;
    }

    public void setStartAction(final Action startAction) {
        this.startAction = startAction;
    }
    
    public Action getFinishAction() {
        return finishAction;
    }

    public void setFinishAction(final Action finishAction) {
        this.finishAction = finishAction;
    }
    
    public Action getFailAction() {
        return failAction;
    }

    public void setFailAction(final Action failAction) {
        this.failAction = failAction;
    }

    public Action getDeathAction() {
        return deathAction;
    }

    public void setDeathAction(final Action deathAction) {
        this.deathAction = deathAction;
    }

    public Map<String, Action> getChatActions() {
        return chatActions;
    }

    public void setChatActions(final Map<String, Action> chatActions) {
        this.chatActions = chatActions;
    }

    public Map<String, Action> getCommandActions() {
        return commandActions;
    }

    public void setCommandActions(final Map<String, Action> commandActions) {
        this.commandActions = commandActions;
    }

    public Action getDisconnectAction() {
        return disconnectAction;
    }

    public void setDisconnectAction(final Action disconnectAction) {
        this.disconnectAction = disconnectAction;
    }
    
    public Condition getCondition() {
        return condition;
    }
    
    public void setCondition(final Condition condition) {
        this.condition = condition;
    }

    public long getDelay() {
        return delay;
    }

    public void setDelay(final long delay) {
        this.delay = delay;
    }

    public String getDelayMessage() {
        return delayMessage;
    }

    public void setDelayMessage(final String delayMessage) {
        this.delayMessage = delayMessage;
    }

    public String getCompleteMessage() {
        return completeMessage;
    }

    public void setCompleteMessage(final String completeMessage) {
        this.completeMessage = completeMessage;
    }

    public String getStartMessage() {
        return startMessage;
    }

    public void setStartMessage(final String startMessage) {
        this.startMessage = startMessage;
    }

    public LinkedList<String> getObjectiveOverrides() {
        return objectiveOverrides;
    }

    public void setObjectiveOverrides(final LinkedList<String> objectiveOverrides) {
        this.objectiveOverrides = objectiveOverrides;
    }
    
    public LinkedList<CustomObjective> getCustomObjectives() {
        return customObjectives;
    }

    public LinkedList<Integer> getCustomObjectiveCounts() {
        return customObjectiveCounts;
    }

    public LinkedList<String> getCustomObjectiveDisplays() {
        return customObjectiveDisplays;
    }

    public LinkedList<Entry<String, Object>> getCustomObjectiveData() {
        return customObjectiveData;
    }

    /**
     * Check if stage has at least one objective<p>
     * 
     * Excludes start/complete message, delay, and objective-override
     * 
     * @return true if stage contains an objective
     */
    public boolean hasObjective() {
        if (blocksToBreak.isEmpty() == false) { return true; }
        if (blocksToDamage.isEmpty() == false) { return true; }
        if (blocksToPlace.isEmpty() == false) { return true; }
        if (blocksToUse.isEmpty() == false) { return true; }
        if (blocksToCut.isEmpty() == false) { return true; }
        if (cowsToMilk != null) { return true; }
        if (fishToCatch != null) { return true; }
        if (playersToKill != null) { return true; }
        if (itemsToCraft.isEmpty() == false) { return true; }
        if (itemsToSmelt.isEmpty() == false) { return true; }
        if (itemsToEnchant.isEmpty() == false) { return true; }
        if (itemsToBrew.isEmpty() == false) { return true; }
        if (itemsToConsume.isEmpty() == false) { return true; }
        if (itemsToDeliver.isEmpty() == false) { return true; }
        if (citizensToInteract.isEmpty() == false) { return true; }
        if (citizensToKill.isEmpty() == false) { return true; }
        if (locationsToReach.isEmpty() == false) { return true; }
        if (mobsToTame.isEmpty() == false) { return true; }
        if (sheepToShear.isEmpty() == false) { return true; }
        if (passwordDisplays.isEmpty() == false) { return true; }
        if (customObjectives.isEmpty() == false) { return true; }
        return false;
    }
    
    /**
     * Check if stage has the specified type of objective<p>
     * 
     * Accepted strings are: breakBlock, damageBlock, placeBlock, useBlock,
     * cutBlock, craftItem, smeltItem, enchantItem, brewItem, milkCow, catchFish,
     * killMob, deliverItem, killPlayer, talkToNPC, killNPC, tameMob,
     * shearSheep, password, reachLocation
     * 
     * @deprecated Use {@link #containsObjective(ObjectiveType)}
     * 
     * @param type The type of objective to check for
     * @return true if stage contains specified objective
     */
    @Deprecated
    public boolean containsObjective(final String type) {
        return containsObjective(ObjectiveType.fromName(type));
    }
    
    /**
     * Check if stage has the specified type of objective<p>
     * 
     * @param type The type of objective to check for
     * @return true if stage contains specified objective
     */
    public boolean containsObjective(final ObjectiveType type) {
        if (type.equals(ObjectiveType.BREAK_BLOCK)) {
            return !blocksToBreak.isEmpty();
        } else if (type.equals(ObjectiveType.DAMAGE_BLOCK)) {
            return !blocksToDamage.isEmpty();
        } else if (type.equals(ObjectiveType.PLACE_BLOCK)) {
            return !blocksToPlace.isEmpty();
        } else if (type.equals(ObjectiveType.USE_BLOCK)) {
            return !blocksToUse.isEmpty();
        } else if (type.equals(ObjectiveType.CUT_BLOCK)) {
            return !blocksToCut.isEmpty();
        } else if (type.equals(ObjectiveType.CRAFT_ITEM)) {
            return !itemsToCraft.isEmpty();
        } else if (type.equals(ObjectiveType.SMELT_ITEM)) {
            return !itemsToSmelt.isEmpty();
        } else if (type.equals(ObjectiveType.ENCHANT_ITEM)) {
            return !itemsToEnchant.isEmpty();
        } else if (type.equals(ObjectiveType.BREW_ITEM)) {
            return !itemsToBrew.isEmpty();
        } else if (type.equals(ObjectiveType.CONSUME_ITEM)) {
            return !itemsToConsume.isEmpty();
        } else if (type.equals(ObjectiveType.DELIVER_ITEM)) {
            return !itemsToDeliver.isEmpty();
        } else if (type.equals(ObjectiveType.MILK_COW)) {
            return cowsToMilk != null;
        } else if (type.equals(ObjectiveType.CATCH_FISH)) {
            return fishToCatch != null;
        } else if (type.equals(ObjectiveType.KILL_MOB)) {
            return !mobsToKill.isEmpty();
        } else if (type.equals(ObjectiveType.KILL_PLAYER)) {
            return playersToKill != null;
        } else if (type.equals(ObjectiveType.TALK_TO_NPC)) {
            return !citizensToInteract.isEmpty();
        } else if (type.equals(ObjectiveType.KILL_NPC)) {
            return !citizensToKill.isEmpty();
        } else if (type.equals(ObjectiveType.TAME_MOB)) {
            return !mobsToTame.isEmpty();
        } else if (type.equals(ObjectiveType.SHEAR_SHEEP)) {
            return !sheepToShear.isEmpty();
        } else if (type.equals(ObjectiveType.REACH_LOCATION)) {
            return !locationsToReach.isEmpty();
        } else if (type.equals(ObjectiveType.PASSWORD)) {
            return !passwordPhrases.isEmpty();
        } else {
            return false;
        }
    }
}
