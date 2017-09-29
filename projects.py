# Create a project object
import scipy.stats as st
from math import *
import Main
class Project:
    #Contruct a Project Object and set all the variables that won't change with
    #the stage j to the values input from external commands
    def __init__(self, i, j = 1, V, m, b = 0, f = 0, Q = 0):
        self.i = i
        self.V = V
        self.m = m

    def setj(self, j):
        self.j = j

    def setb(self, mean, stdDeviation):
        norm1 = st.norm(loc = mean, scale = stdDeviation)
        self.b = norm1.rvs()

    def setf(self, mean, stdDeviation):
        norm1 = st.norm(loc = mean, scale = stdDeviation)
        self.f = norm1.rvs()

    def calcQ(self):
        S0 = V * (1 + Main.s)




