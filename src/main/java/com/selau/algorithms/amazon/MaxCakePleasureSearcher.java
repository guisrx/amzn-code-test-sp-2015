package com.selau.algorithms.amazon;

/**
 *  Problem B:
 *
 *  Solution: Generates all the possibilities top -> bottom and bottom -> top.
 *  Evaluates if the possibility is valid and then evaluates its value.
 *  Outputs the highest value found for a valid possibility.
 *
 *  Improvement: generate only valid possibilities changing the iterations indexes
 *  and use dynamic programming to not have to calculate possibilities already evaluated.
 *
 * @author selau
 *
 */
public class MaxCakePleasureSearcher {

    public static Integer cake(final int[] layers) {
        int maxPleasure = 0;

        for (int topLayer = -1; topLayer < layers.length; topLayer++) {
            for (int bottomLayer = layers.length; bottomLayer >= 0; bottomLayer--) {

                final int pleasure = evaluatePleasure(layers, topLayer, bottomLayer);

                if (pleasure > maxPleasure) {
                    maxPleasure = pleasure;
                }
            }
        }
        return maxPleasure;
    }

    private static int evaluatePleasure(final int[] layers, final int topLayer, final int bottomLayer) {
        if (topLayer >= bottomLayer)
            return Integer.MIN_VALUE;

        int totalPleasure = 0;

        for (int layer = 0; layer < layers.length; layer++) {
            if ((layer <= topLayer) || (layer >= bottomLayer)) {

                totalPleasure += layers[layer];
            }
        }
        return totalPleasure;
    }

}
